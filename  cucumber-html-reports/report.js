$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ChocolateBarDistribution.feature");
formatter.feature({
  "line": 1,
  "name": "Chocolate bar distribution",
  "description": "",
  "id": "chocolate-bar-distribution",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "A basket contains \"\u003ctotalChocolateBars\u003e\" chocolate bars. \nOn Halloween night, \"\u003ctreatChocolateBars\u003e\" chocolate bars were given out as treats;\nfriends at home ate \"\u003cfriendsEatenChocolateBars\u003e\" bars from the basket,\n\"\u003ccoworkersEatenChocolateBars\u003e\" bars were shared with co-workers on the following day remaining chocolates were kept in storage \nand the rest were kept in storage",
  "id": "chocolate-bar-distribution;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "a basket contains \"\u003ctotalChocolateBars\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "as treat \"\u003ctreatChocolateBars\u003e\" were given out",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "friends ate \"\u003cfriendsEatenChocolateBars\u003e\" from the basket",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "coworkers ate \"\u003ccoworkersEatenChocolateBars\u003e\" on the following day",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "remaining chocolates were kept in storage",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "chocolate-bar-distribution;;",
  "rows": [
    {
      "cells": [
        "totalChocolateBars",
        "treatChocolateBars",
        "friendsEatenChocolateBars",
        "coworkersEatenChocolateBars"
      ],
      "line": 18,
      "id": "chocolate-bar-distribution;;;1"
    },
    {
      "cells": [
        "300",
        "50",
        "72",
        "25"
      ],
      "line": 19,
      "id": "chocolate-bar-distribution;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "A basket contains \"\u003ctotalChocolateBars\u003e\" chocolate bars. \nOn Halloween night, \"\u003ctreatChocolateBars\u003e\" chocolate bars were given out as treats;\nfriends at home ate \"\u003cfriendsEatenChocolateBars\u003e\" bars from the basket,\n\"\u003ccoworkersEatenChocolateBars\u003e\" bars were shared with co-workers on the following day remaining chocolates were kept in storage \nand the rest were kept in storage",
  "id": "chocolate-bar-distribution;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "a basket contains \"300\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "as treat \"50\" were given out",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "friends ate \"72\" from the basket",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "coworkers ate \"25\" on the following day",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "remaining chocolates were kept in storage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "300",
      "offset": 19
    }
  ],
  "location": "ChocolateBarDistribution.a_basket_contains_totalChocolateBars(int)"
});
formatter.result({
  "duration": 206990168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 10
    }
  ],
  "location": "ChocolateBarDistribution.treatChocolateBars_were_given_out_as_treats(String)"
});
formatter.result({
  "duration": 1706668,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "72",
      "offset": 13
    }
  ],
  "location": "ChocolateBarDistribution.friends_ate_friendsEatenChocolateBars_from_the_basket(int)"
});
formatter.result({
  "duration": 114347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 15
    }
  ],
  "location": "ChocolateBarDistribution.coworkers_ate_coworkersEatenChocolateBars_on_the_following_day(int)"
});
formatter.result({
  "duration": 110507,
  "status": "passed"
});
formatter.match({
  "location": "ChocolateBarDistribution.remaining_chocolates_were_kept_in_storage()"
});
formatter.result({
  "duration": 9285551,
  "status": "passed"
});
});