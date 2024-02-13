package com.MiPrimerApi.MiPrimeraApi.domain.dto.enums;

public enum AlbumesEnum {

    THE_HIVES("THE_HIVES","6agQKhrctciHD4QH7KufOS"),
    DOJA_CAT("DOJA_CAT","6DmPNcfpkXBVRJsEIJY9tl");

    final String nombre;
    final String id;

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    AlbumesEnum(final String nombre, final String id){
                this.nombre = id;
                this.id = id;
    }
}
