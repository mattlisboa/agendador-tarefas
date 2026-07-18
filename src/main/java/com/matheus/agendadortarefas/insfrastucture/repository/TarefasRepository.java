package com.matheus.agendadortarefas.insfrastucture.repository;

import com.matheus.agendadortarefas.insfrastucture.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity , String> {
}
