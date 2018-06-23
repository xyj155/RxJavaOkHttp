package com.example.administrator.rxjavaokhttp.entity;

/**
 * Created by Administrator on 2018/6/23/023.
 */

public class EntityData {
    private Entity entities;
    private User users;

    public EntityData(Entity entities, User users) {
        this.entities = entities;
        this.users = users;
    }

    public Entity getEntities() {
        if (entities == null) {
                return new Entity();
        }
        return entities;
    }
    public User getUsers() {
        if (users == null) {
            return new User();
        }
        return users;
    }
}
