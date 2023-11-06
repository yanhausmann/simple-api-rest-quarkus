package org.hausmann.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.hausmann.model.Customer;
import org.hausmann.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/customer")
public class CustomerController {

    @Inject
    CustomerService customerService; // Vamos utilizar todos os metodos que estão na CustomerService

    @GET // Fazer uma requisição no endereço /api/customer (Path)
    public List<Customer> retrieveCustomer(){

        List<Customer> customers = new ArrayList<>();
        try {
            customers = customerService.findAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    @POST // Inserir informações através do Path (/api/customer)
     public void addCustomer(Customer customer) { // Vai receber o que precisa adicionar e enviar para o metodo addCustomer
        customerService.addCustomer(customer);
    }
}
