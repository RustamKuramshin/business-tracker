package ru.zencode.businesstracker.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ProjectStatus implements EnumClass<String> {

    CREATED("A"),
    IN_PROGRESS("B"),
    DONE("C"),
    CANCELLED("D");

    private final String id;

    ProjectStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ProjectStatus fromId(String id) {
        for (ProjectStatus at : ProjectStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}