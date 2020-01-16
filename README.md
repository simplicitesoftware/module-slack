<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`Slack` module definition
=========================

### Introduction

Slack integration examples:

- A Slack webhook endpoint for incoming events from Slack
- A Slack client external object

### Import

To import this module:

- Create a module named `Slack`
- Set the settings as:

```json
{
	"type": "git",
	"origin": {
		"uri": "https://github.com/simplicitesoftware/module-slack.git"
	}
}
```

- Click on the _Import module_ button

### Configure

There is one system parameters to configure:

- The `SLACK_CREDENTIALS` in which you must set your Slack API client ID, secrets and signing secrets

> **Note**: it is possible to ovveride these default parameters per user using corresponding user parameters.

`SlackClientExample` external object definition
-----------------------------------------------

Slack client example


`SlackWebhook` external object definition
-----------------------------------------

Slack webhook


