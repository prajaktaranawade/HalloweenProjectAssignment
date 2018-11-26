Feature: Chocolate bar distribution

@Scenario1
  Scenario Outline: 
    A basket contains "<totalChocolateBars>" chocolate bars. 
    On Halloween night, "<treatChocolateBars>" chocolate bars were given out as treats;
    friends at home ate "<friendsEatenChocolateBars>" bars from the basket,
    "<coworkersEatenChocolateBars>" bars were shared with co-workers on the following day remaining chocolates were kept in storage 
    and the rest were kept in storage
    
    Given a basket contains "<totalChocolateBars>"
    When as treat "<treatChocolateBars>" were given out
    And friends ate "<friendsEatenChocolateBars>" from the basket
    And coworkers ate "<coworkersEatenChocolateBars>" on the following day
    Then remaining chocolates were kept in storage

    Examples: 
      | totalChocolateBars | treatChocolateBars | friendsEatenChocolateBars | coworkersEatenChocolateBars |
      |                300 |                 50 |                        72 |                          25 |