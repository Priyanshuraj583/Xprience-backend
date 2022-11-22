package com.xprience.xprience.APIs.user.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class UserModel extends AbstractPersistable<Long> {

}
