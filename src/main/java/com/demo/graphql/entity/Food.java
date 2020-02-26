package com.demo.graphql.entity;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Food {

  @Id
  @GeneratedValue
  @GraphQLQuery(name = "id", description = "A food's id")
  private Long id;

  @GraphQLQuery(name = "name", description = "A food's name")
  private String name;

  @Override
  public String toString() {
    return "Food{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
