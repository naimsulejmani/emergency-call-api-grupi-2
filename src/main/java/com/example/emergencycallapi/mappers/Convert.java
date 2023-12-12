package com.example.emergencycallapi.mappers;

public interface Convert<Entity, Dto> {
    public Entity toEntity(Dto item);

    public Dto toDto(Entity item);
}
