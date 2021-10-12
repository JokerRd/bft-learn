package com.bftcom.bftlearn.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class KeyVerifiedTest {
    private final String username;
    private final Long idTest;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KeyVerifiedTest)) return false;
        KeyVerifiedTest that = (KeyVerifiedTest) o;
        return Objects.equals(username, that.username) && Objects.equals(idTest, that.idTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, idTest);
    }
}
