package org.hausmann.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.hausmann.model.Customer;

@ApplicationScoped // Essa anotação define que essa classe faz parte do scopo total da aplicação, tratada igualmente pelo quarkus como todas as outras.
public class CustomerRepository implements PanacheRepository<Customer> {
    //A classe CustomerRepository vai implementar os métodos que estão dentro da classe PanacheRepository
    // que insere e busca informações de dentro do banco de dados da tabela definida <Customer>
}
