package com.game.store.model.dto.studio;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudioRequest {

    private String country;
    private Long id;

    public StudioRequest(String country, Long id) {
        this.country = country;
        this.id = id;
    }
}
