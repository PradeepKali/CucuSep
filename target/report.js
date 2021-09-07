$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/AddCucumber.feature");
formatter.feature({
  "name": "Demo Telecom",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on the add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPlanDetails.click_on_the_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add tariff plan validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user need to fillup the fields",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPlanDetails.user_need_to_fillup_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPlanDetails.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verified tariff plans added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPlanDetails.verified_tariff_plans_added()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on the add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPlanDetails.click_on_the_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add tariff plan validation by 1 dimensional list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user need to fillup the fields by 1d list",
  "rows": [
    {
      "cells": [
        "9000",
        "600",
        "80",
        "50",
        "19",
        "1",
        "2"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPlanDetails.user_need_to_fillup_the_fields_by_d_list(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPlanDetails.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verified tariff plans added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPlanDetails.verified_tariff_plans_added()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on the add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPlanDetails.click_on_the_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add tariff plan validation by 1 dimensional map",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user need to fillup the fields by 1d map",
  "rows": [
    {
      "cells": [
        "rent",
        "10000"
      ]
    },
    {
      "cells": [
        "flm",
        "700"
      ]
    },
    {
      "cells": [
        "fim",
        "90"
      ]
    },
    {
      "cells": [
        "fsp",
        "60"
      ]
    },
    {
      "cells": [
        "lmc",
        "29"
      ]
    },
    {
      "cells": [
        "ipc",
        "2"
      ]
    },
    {
      "cells": [
        "spc",
        "3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPlanDetails.user_need_to_fillup_the_fields_by_d_map(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerPlanDetails.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verified tariff plans added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPlanDetails.verified_tariff_plans_added()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});