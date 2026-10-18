package com.game.store.model.dto.studio;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudioResponse {

    private String country;
    private String name;

    public StudioResponse(String country, String name) {
        this.country = country;
        this.name = name;
    }
}
