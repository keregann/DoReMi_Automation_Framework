$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignIn.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Margarita"
    }
  ]
});
formatter.before({
  "duration": 11316171500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-functionality;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks \u0027Login Button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\u0027Login\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters the following values:",
  "rows": [
    {
      "cells": [
        "email",
        "user@phptravels.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "password",
        "demouser"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks \u0027Login Button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "\u0027User Account\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user clicks \u0027Logout\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "\u0027Login\u0027 page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 328246200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2015609900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Button",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 3060748400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 17135300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 584364200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Button",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 5704940500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User Account",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 70115200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1135025500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 3773330200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 12175400,
  "status": "passed"
});
formatter.after({
  "duration": 1089966200,
  "status": "passed"
});
formatter.before({
  "duration": 9644497400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login with invalid valid credentials",
  "description": "",
  "id": "login-functionality;login-with-invalid-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user clicks \u0027Login Button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "\u0027Login\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters the following values:",
  "rows": [
    {
      "cells": [
        "email",
        "margarita.gabureac@mail.com"
      ],
      "line": 27
    },
    {
      "cells": [
        "password",
        "0123"
      ],
      "line": 28
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user clicks \u0027Login Button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "warning \u0027INVALID_LOGIN_PASSWORD\u0027 is present on the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 33703900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1844286200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Button",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 3100444100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 7782000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 700808600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Button",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 962793800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID_LOGIN_PASSWORD",
      "offset": 9
    }
  ],
  "location": "Steps.warningMessageIsPresentOnThePage(WarningMessages)"
});
formatter.result({
  "duration": 68314400,
  "status": "passed"
});
formatter.after({
  "duration": 1604253100,
  "status": "passed"
});
formatter.uri("SignUp.feature");
formatter.feature({
  "line": 2,
  "name": "Sign Up functionality",
  "description": "",
  "id": "sign-up-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Margarita"
    }
  ]
});
formatter.before({
  "duration": 8245354200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "SignUp with valid credentials",
  "description": "",
  "id": "sign-up-functionality;signup-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "\u0027Sign Up\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the following values:",
  "rows": [
    {
      "cells": [
        "firstName",
        "Pop"
      ],
      "line": 10
    },
    {
      "cells": [
        "lastName",
        "Diana"
      ],
      "line": 11
    },
    {
      "cells": [
        "mobileNumber",
        "06521347"
      ],
      "line": 12
    },
    {
      "cells": [
        "email",
        "abrakadabra21@mail.ru"
      ],
      "line": 13
    },
    {
      "cells": [
        "password",
        "0123456"
      ],
      "line": 14
    },
    {
      "cells": [
        "confirm",
        "0123456"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "\u0027User Account\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clicks \u0027Logout\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "\u0027Login\u0027 page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 30942500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2100977400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2907845200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 8340200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 1691847500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2863451100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User Account",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 10779200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 953780500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logout",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 3945210900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 8779200,
  "status": "passed"
});
formatter.after({
  "duration": 1025111800,
  "status": "passed"
});
formatter.before({
  "duration": 5378098600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate all fields on Sing Up page",
  "description": "",
  "id": "sign-up-functionality;validate-all-fields-on-sing-up-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "\u0027Sign Up\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "warning \u0027INVALID_EMAIL\u0027 is present on the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 4325790700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1727581700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2680151100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 7727600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1069221500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID_EMAIL",
      "offset": 9
    }
  ],
  "location": "Steps.warningMessageIsPresentOnThePage(WarningMessages)"
});
formatter.result({
  "duration": 81659900,
  "status": "passed"
});
formatter.after({
  "duration": 1049763300,
  "status": "passed"
});
formatter.before({
  "duration": 9272993100,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Validate the connection between Password and Confirm Password",
  "description": "",
  "id": "sign-up-functionality;validate-the-connection-between-password-and-confirm-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "\u0027Sign Up\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user enters the following values:",
  "rows": [
    {
      "cells": [
        "password",
        "123654"
      ],
      "line": 36
    },
    {
      "cells": [
        "confirm",
        "123123"
      ],
      "line": 37
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "warning \u0027INVALID_MATCHING_OF_PASSWORD\u0027 is present on the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 16949100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1888620600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2877760500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 9037300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 458405600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 969777500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID_MATCHING_OF_PASSWORD",
      "offset": 9
    }
  ],
  "location": "Steps.warningMessageIsPresentOnThePage(WarningMessages)"
});
formatter.result({
  "duration": 56390600,
  "status": "passed"
});
formatter.after({
  "duration": 976596600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 42,
  "name": "Validate Email and Password fields on Sing Up page",
  "description": "",
  "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 43,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user clicks \u0027SignUp\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "\u0027SignUp\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user enters the following values:",
  "rows": [
    {
      "cells": [
        "\u003ckey\u003e",
        "\u003cvalue\u003e"
      ],
      "line": 48
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "warning \u0027\u003cmessage\u003e\u0027 is present on the page",
  "keyword": "Then "
});
formatter.examples({
  "line": 52,
  "name": "",
  "description": "",
  "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;",
  "rows": [
    {
      "cells": [
        "key",
        "value",
        "message"
      ],
      "line": 53,
      "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;1"
    },
    {
      "cells": [
        "Password",
        "12345",
        "INVALID_DATA_PASSWORD"
      ],
      "line": 54,
      "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;2"
    },
    {
      "cells": [
        "Email",
        "adsdsdc.com",
        "INVALID_DATA_MAIL"
      ],
      "line": 55,
      "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;3"
    },
    {
      "cells": [
        "Email",
        "addc@xds",
        "INVALID_DATA_MAIL"
      ],
      "line": 56,
      "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8972872300,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "Validate Email and Password fields on Sing Up page",
  "description": "",
  "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Margarita"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user clicks \u0027SignUp\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "\u0027SignUp\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user enters the following values:",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "Password",
        "12345"
      ],
      "line": 48
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "warning \u0027INVALID_DATA_PASSWORD\u0027 is present on the page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 9205300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1584916700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignUp",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2945742700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignUp",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 15366100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 227849900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1030363300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID_DATA_PASSWORD",
      "offset": 9
    }
  ],
  "location": "Steps.warningMessageIsPresentOnThePage(WarningMessages)"
});
formatter.result({
  "duration": 75912600,
  "status": "passed"
});
formatter.after({
  "duration": 1095060800,
  "status": "passed"
});
formatter.before({
  "duration": 9051719900,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Validate Email and Password fields on Sing Up page",
  "description": "",
  "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Margarita"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user clicks \u0027SignUp\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "\u0027SignUp\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user enters the following values:",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "Email",
        "adsdsdc.com"
      ],
      "line": 48
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "warning \u0027INVALID_DATA_MAIL\u0027 is present on the page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 38976900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1716206400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignUp",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2852799900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignUp",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 7936900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 321381400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1108123400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID_DATA_MAIL",
      "offset": 9
    }
  ],
  "location": "Steps.warningMessageIsPresentOnThePage(WarningMessages)"
});
formatter.result({
  "duration": 56078900,
  "status": "passed"
});
formatter.after({
  "duration": 1435309500,
  "status": "passed"
});
formatter.before({
  "duration": 8654383000,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Validate Email and Password fields on Sing Up page",
  "description": "",
  "id": "sign-up-functionality;validate-email-and-password-fields-on-sing-up-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Margarita"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "\u0027Home\u0027 page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user clicks \u0027My Account\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user clicks \u0027SignUp\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "\u0027SignUp\u0027 page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user enters the following values:",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "Email",
        "addc@xds"
      ],
      "line": 48
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user clicks \u0027Sign Up\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "warning \u0027INVALID_DATA_MAIL\u0027 is present on the page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 24965100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Account",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1655533700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignUp",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 2937127600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignUp",
      "offset": 1
    }
  ],
  "location": "Steps.pageIsDisplayed(String)"
});
formatter.result({
  "duration": 6568700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEntersTheFollowingValues(DataTable)"
});
formatter.result({
  "duration": 278757300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up",
      "offset": 13
    }
  ],
  "location": "Steps.click(String)"
});
formatter.result({
  "duration": 1055670900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID_DATA_MAIL",
      "offset": 9
    }
  ],
  "location": "Steps.warningMessageIsPresentOnThePage(WarningMessages)"
});
formatter.result({
  "duration": 53584400,
  "status": "passed"
});
formatter.after({
  "duration": 1038719300,
  "status": "passed"
});
});