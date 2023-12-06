package br.com.financasProjeto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FinancasController implements FinancasControllerInterface{

    @Override
    public String testeApi()
    {
        return "Testando API megatron.";
    }

}
