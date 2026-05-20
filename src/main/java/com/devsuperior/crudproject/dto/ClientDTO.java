package com.devsuperior.crudproject.dto;

import com.devsuperior.crudproject.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Objects;

public class ClientDTO implements Comparable<ClientDTO>{
    private Long id;
    @NotBlank(message = "Campo precisa ser preenchido")
    @Size(min = 3, max = 20, message = "Nome inválido")
    private String name;
    @NotBlank(message = "Campo precisa ser preenchido")
    private String cpf;
    @Positive(message = "Campo não pode ser negativo")
    private Double income;
    @PastOrPresent(message = "Não pode ser uma data futura")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthDate = client.getBirthDate();
        this.children = client.getChildren();
    }

    public ClientDTO (){};

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public int compareTo(ClientDTO other) {
        if(this.cpf.equals(other.cpf)) {
            return 0;
        }

        return this.id.compareTo(other.id);
    }
}
