package com.joao.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.todo.domain.Todo;
import com.joao.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaDatabase() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot", LocalDateTime.parse("06/12/2023 15:51", formatter),
				false);
		Todo t2 = new Todo(null, "Cozinhar", "Fazer almoço", LocalDateTime.parse("06/12/2023 15:51", formatter), true);
		Todo t3 = new Todo(null, "Academia", "Ir treinar", LocalDateTime.parse("06/12/2023 15:51", formatter), false);
		Todo t4 = new Todo(null, "Jogar", "Jogar um pouco de videogame",
				LocalDateTime.parse("06/12/2023 15:51", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
