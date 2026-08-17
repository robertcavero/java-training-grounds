package br.com.dio.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class UserModel {
    private int code;
    private String userName;
    private LocalDate birthday;
}
