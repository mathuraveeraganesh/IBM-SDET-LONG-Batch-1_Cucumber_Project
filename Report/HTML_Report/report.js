$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SuiteCRM_CountingDashlets.feature");
formatter.feature({
  "line": 2,
  "name": "Counting Dashlets",
  "description": "",
  "id": "counting-dashlets",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Open the homepage and count the number of the dashlets on the page.",
  "description": "",
  "id": "counting-dashlets;open-the-homepage-and-count-the-number-of-the-dashlets-on-the-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Count the number of Dashlets and Print the No and title of each Dashlet",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 12564433800,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 8245739300,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.count_the_number_of_Dashlets_and_Print_the_No_and_title_of_each_Dashlet()"
});
formatter.result({
  "duration": 119892800,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 2410533900,
  "status": "passed"
});
formatter.uri("SuiteCRM_CreatingLeadsParameterization.feature");
formatter.feature({
  "line": 2,
  "name": "Create leads using parameterization",
  "description": "",
  "id": "create-leads-using-parameterization",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Add information about a candidate for recruitment",
  "description": "",
  "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Sales -\u003e Leads -\u003e Create Lead",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "And Fill in the required Create Lead fields using the \"\u003csalutation\u003e\" \"\u003cFirstName\u003e\" \"\u003cLastName\u003e\" \"\u003cPhone_work\u003e\" and \"\u003cPhone_mobile\u003e\" data from the Examples table",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click Save to finish",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Navigate to the View Leads page to see results \"\u003cFirstName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment;",
  "rows": [
    {
      "cells": [
        "salutation",
        "FirstName",
        "LastName",
        "Phone_work",
        "Phone_mobile"
      ],
      "line": 15,
      "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment;;1"
    },
    {
      "cells": [
        "Mr.",
        "Veera3",
        "Ganesh",
        "9987654398",
        "8976543797"
      ],
      "line": 16,
      "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment;;2"
    },
    {
      "cells": [
        "Mr.",
        "Mathura3",
        "Ganesh",
        "9987654399",
        "8976543798"
      ],
      "line": 17,
      "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Add information about a candidate for recruitment",
  "description": "",
  "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Sales -\u003e Leads -\u003e Create Lead",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "And Fill in the required Create Lead fields using the \"Mr.\" \"Veera3\" \"Ganesh\" \"9987654398\" and \"8976543797\" data from the Examples table",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click Save to finish",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Navigate to the View Leads page to see results \"Veera3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 8643723600,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 7680681300,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_Sales_Leads_Create_Lead()"
});
formatter.result({
  "duration": 5354836400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr.",
      "offset": 55
    },
    {
      "val": "Veera3",
      "offset": 61
    },
    {
      "val": "Ganesh",
      "offset": 70
    },
    {
      "val": "9987654398",
      "offset": 79
    },
    {
      "val": "8976543797",
      "offset": 96
    }
  ],
  "location": "SuiteCRMSteps.and_Fill_in_the_required_Create_Lead_fields_using_the_and_data_from_the_Examples_table(String,String,String,String,String)"
});
formatter.result({
  "duration": 807426700,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_to_finish()"
});
formatter.result({
  "duration": 7223991500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Veera3",
      "offset": 48
    }
  ],
  "location": "SuiteCRMSteps.navigate_to_the_View_Leads_page_to_see_results(String)"
});
formatter.result({
  "duration": 6267506300,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 1935417700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Add information about a candidate for recruitment",
  "description": "",
  "id": "create-leads-using-parameterization;add-information-about-a-candidate-for-recruitment;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Sales -\u003e Leads -\u003e Create Lead",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "And Fill in the required Create Lead fields using the \"Mr.\" \"Mathura3\" \"Ganesh\" \"9987654399\" and \"8976543798\" data from the Examples table",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click Save to finish",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Navigate to the View Leads page to see results \"Mathura3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 8625205300,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 7758597300,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_Sales_Leads_Create_Lead()"
});
formatter.result({
  "duration": 4966962500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr.",
      "offset": 55
    },
    {
      "val": "Mathura3",
      "offset": 61
    },
    {
      "val": "Ganesh",
      "offset": 72
    },
    {
      "val": "9987654399",
      "offset": 81
    },
    {
      "val": "8976543798",
      "offset": 98
    }
  ],
  "location": "SuiteCRMSteps.and_Fill_in_the_required_Create_Lead_fields_using_the_and_data_from_the_Examples_table(String,String,String,String,String)"
});
formatter.result({
  "duration": 692375100,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_to_finish()"
});
formatter.result({
  "duration": 7099505900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mathura3",
      "offset": 48
    }
  ],
  "location": "SuiteCRMSteps.navigate_to_the_View_Leads_page_to_see_results(String)"
});
formatter.result({
  "duration": 6299298700,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 2368772900,
  "status": "passed"
});
formatter.uri("SuiteCRM_Schedule_Meeting.feature");
formatter.feature({
  "line": 2,
  "name": "Schedule a meeting and invite members",
  "description": "",
  "id": "schedule-a-meeting-and-invite-members",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To schedule a meeting and include at least 3 invitees",
  "description": "",
  "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Activities -\u003e Meetings -\u003e Schedule a Meeting",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the Subject \"\u003cSubject\u003e\" of the meeting.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Search for members \"\u003cName\u003e\" and add them to the meeting",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Save Meeting to finish",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Navigate to View Meetings page and confirm creation of the meeting for \"\u003cSubject\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;",
  "rows": [
    {
      "cells": [
        "Subject",
        "",
        "Name"
      ],
      "line": 16,
      "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;1"
    },
    {
      "cells": [
        "TestMathura",
        "",
        "admin"
      ],
      "line": 17,
      "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;2"
    },
    {
      "cells": [
        "TestVeera",
        "",
        "max"
      ],
      "line": 18,
      "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;3"
    },
    {
      "cells": [
        "TestGanesh",
        "",
        "chris"
      ],
      "line": 19,
      "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "To schedule a meeting and include at least 3 invitees",
  "description": "",
  "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Activities -\u003e Meetings -\u003e Schedule a Meeting",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the Subject \"TestMathura\" of the meeting.",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Search for members \"admin\" and add them to the meeting",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Save Meeting to finish",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Navigate to View Meetings page and confirm creation of the meeting for \"TestMathura\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 8664560500,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 8010235900,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_Activities_Meetings_Schedule_a_Meeting()"
});
formatter.result({
  "duration": 6671099600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestMathura",
      "offset": 19
    }
  ],
  "location": "SuiteCRMSteps.enter_the_details_of_the_meeting(String)"
});
formatter.result({
  "duration": 119540000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 20
    }
  ],
  "location": "SuiteCRMSteps.search_for_members_and_add_them_to_the_meeting(String)"
});
formatter.result({
  "duration": 6475503200,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_Meeting_to_finish()"
});
formatter.result({
  "duration": 6783746800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestMathura",
      "offset": 72
    }
  ],
  "location": "SuiteCRMSteps.navigate_to_View_Meetings_page_and_confirm_creation_of_the_meeting(String)"
});
formatter.result({
  "duration": 6212311400,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 2115880200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To schedule a meeting and include at least 3 invitees",
  "description": "",
  "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Activities -\u003e Meetings -\u003e Schedule a Meeting",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the Subject \"TestVeera\" of the meeting.",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Search for members \"max\" and add them to the meeting",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Save Meeting to finish",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Navigate to View Meetings page and confirm creation of the meeting for \"TestVeera\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 8453113500,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 7870816700,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_Activities_Meetings_Schedule_a_Meeting()"
});
formatter.result({
  "duration": 6268429500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestVeera",
      "offset": 19
    }
  ],
  "location": "SuiteCRMSteps.enter_the_details_of_the_meeting(String)"
});
formatter.result({
  "duration": 86433800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "max",
      "offset": 20
    }
  ],
  "location": "SuiteCRMSteps.search_for_members_and_add_them_to_the_meeting(String)"
});
formatter.result({
  "duration": 6473383000,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_Meeting_to_finish()"
});
formatter.result({
  "duration": 7055026900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestVeera",
      "offset": 72
    }
  ],
  "location": "SuiteCRMSteps.navigate_to_View_Meetings_page_and_confirm_creation_of_the_meeting(String)"
});
formatter.result({
  "duration": 6299364600,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 2132487600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To schedule a meeting and include at least 3 invitees",
  "description": "",
  "id": "schedule-a-meeting-and-invite-members;to-schedule-a-meeting-and-include-at-least-3-invitees;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to Activities -\u003e Meetings -\u003e Schedule a Meeting",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the Subject \"TestGanesh\" of the meeting.",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Search for members \"chris\" and add them to the meeting",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Save Meeting to finish",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Navigate to View Meetings page and confirm creation of the meeting for \"TestGanesh\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 8456920500,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 7958292500,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_Activities_Meetings_Schedule_a_Meeting()"
});
formatter.result({
  "duration": 6208234700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestGanesh",
      "offset": 19
    }
  ],
  "location": "SuiteCRMSteps.enter_the_details_of_the_meeting(String)"
});
formatter.result({
  "duration": 85480300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chris",
      "offset": 20
    }
  ],
  "location": "SuiteCRMSteps.search_for_members_and_add_them_to_the_meeting(String)"
});
formatter.result({
  "duration": 6421266000,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_Meeting_to_finish()"
});
formatter.result({
  "duration": 6946377100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestGanesh",
      "offset": 72
    }
  ],
  "location": "SuiteCRMSteps.navigate_to_View_Meetings_page_and_confirm_creation_of_the_meeting(String)"
});
formatter.result({
  "duration": 6239731100,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 1982016800,
  "status": "passed"
});
formatter.uri("SuiteHRM_CreatingProduct.feature");
formatter.feature({
  "line": 2,
  "name": "Creating a Product",
  "description": "",
  "id": "creating-a-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To use an external data to add products",
  "description": "",
  "id": "creating-a-product;to-use-an-external-data-to-add-products",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to All -\u003e Products-\u003e Create Product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the productName \"\u003cProductName\u003e\" and Price \"\u003cPrice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click Save To Create Product",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Go to the View Products page to see product \"\u003cProductName\u003e\" listed",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "creating-a-product;to-use-an-external-data-to-add-products;",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Price"
      ],
      "line": 15,
      "id": "creating-a-product;to-use-an-external-data-to-add-products;;1"
    },
    {
      "cells": [
        "ProductTest",
        "50"
      ],
      "line": 16,
      "id": "creating-a-product;to-use-an-external-data-to-add-products;;2"
    },
    {
      "cells": [
        "ProductTest2",
        "70"
      ],
      "line": 17,
      "id": "creating-a-product;to-use-an-external-data-to-add-products;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "To use an external data to add products",
  "description": "",
  "id": "creating-a-product;to-use-an-external-data-to-add-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to All -\u003e Products-\u003e Create Product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the productName \"ProductTest\" and Price \"50\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click Save To Create Product",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Go to the View Products page to see product \"ProductTest\" listed",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 9345835500,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 7725187800,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_All_Products_Create_Product()"
});
formatter.result({
  "duration": 6223044400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ProductTest",
      "offset": 23
    },
    {
      "val": "50",
      "offset": 47
    }
  ],
  "location": "SuiteCRMSteps.enter_the_productName_and_Price(String,String)"
});
formatter.result({
  "duration": 181989200,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_To_Create_Product()"
});
formatter.result({
  "duration": 6791767300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ProductTest",
      "offset": 45
    }
  ],
  "location": "SuiteCRMSteps.go_to_the_View_Products_page_to_see_product_listed(String)"
});
formatter.result({
  "duration": 6327439100,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 2100474900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To use an external data to add products",
  "description": "",
  "id": "creating-a-product;to-use-an-external-data-to-add-products;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SuiteCRM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on SuiteCRMUrl Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters SuiteCRM UserNames and Passwords",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to All -\u003e Products-\u003e Create Product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the productName \"ProductTest2\" and Price \"70\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click Save To Create Product",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Go to the View Products page to see product \"ProductTest2\" listed",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close the CRMbrowser.",
  "keyword": "Then "
});
formatter.match({
  "location": "SuiteCRMSteps.user_is_on_SuiteCRMUrl_Login_Page()"
});
formatter.result({
  "duration": 8625016800,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.user_enters_SuiteCRM_UserNames_and_Passwords()"
});
formatter.result({
  "duration": 7805244900,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.navigate_to_All_Products_Create_Product()"
});
formatter.result({
  "duration": 6264018500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ProductTest2",
      "offset": 23
    },
    {
      "val": "70",
      "offset": 48
    }
  ],
  "location": "SuiteCRMSteps.enter_the_productName_and_Price(String,String)"
});
formatter.result({
  "duration": 149755700,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.click_Save_To_Create_Product()"
});
formatter.result({
  "duration": 7455151600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ProductTest2",
      "offset": 45
    }
  ],
  "location": "SuiteCRMSteps.go_to_the_View_Products_page_to_see_product_listed(String)"
});
formatter.result({
  "duration": 6618388200,
  "status": "passed"
});
formatter.match({
  "location": "SuiteCRMSteps.close_the_CRMbrowser()"
});
formatter.result({
  "duration": 3688379500,
  "status": "passed"
});
});