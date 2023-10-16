package com.bauzil.todolist_app.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

/*
 * ID
 * Usuário (ID_USUARIO)
 * Descrição
 * Título
 * Data Início
 * Data término
 * Prioridade
 * 
 */


public class TaskModel {

    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private UUID idUser;
}
