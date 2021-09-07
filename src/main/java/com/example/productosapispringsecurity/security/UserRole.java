package com.example.productosapispringsecurity.security;

import java.util.Set;

public enum UserRole {
    ADMIN(Set.of(
            UserPermission.USER_WRITE, UserPermission.USER_READ, UserPermission.PRODUCTO_READ, UserPermission.PRODUCTO_WRITE
    )),
    CLIENTE(Set.of(
            UserPermission.USER_WRITE, UserPermission.USER_READ,UserPermission.PRODUCTO_READ
    ));

    private Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }
}
