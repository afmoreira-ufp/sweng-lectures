package pt.ufp.info.esof.lectures.services.usecases.facade;

import org.springframework.stereotype.Service;
import pt.ufp.info.esof.lectures.models.Explicador;
import pt.ufp.info.esof.lectures.repositories.ExplicadorRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListTodosExplicadoresUseCase {
    private final ExplicadorRepository explicadorRepository;

    public ListTodosExplicadoresUseCase(ExplicadorRepository explicadorRepository) {
        this.explicadorRepository = explicadorRepository;
    }

    public List<Explicador> findAll() {
        List<Explicador> explicadores=new ArrayList<>();
        explicadorRepository.findAll().forEach(explicadores::add);
        return explicadores;
    }
}
