package org.hausmann.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.hausmann.model.Customer;
import org.hausmann.repository.CustomerRepository;

import java.util.List;

@ApplicationScoped
public class CustomerService {

    /*
     Anotacao Inject serve para injetar a classe CustomerRepository dentro da classe CustomerService (instanciar) para
     em ttodo o escopo do CustomerService nos possamos acessar os metodos do customerRepository
    */
    @Inject
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers() { // Metodo para retornar uma lista de Customer
        return customerRepository.findAll().list(); // .list é um metodo do panache para transformar o findAll numa lista
    }

    @Transactional // Serve para permitir alterar algo no banco de dados como Salvar por exemplo. Poderia ser adicionado no addCustomer
    public void addCustomer(Customer customer) { // Metodo para salvar no banco tudo que entra na variavel "customer"
        customerRepository.persist(customer);
    }
}
