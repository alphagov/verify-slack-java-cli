# verify-slack-java-cli
Simple cli tool to interact with Slack from within a Concourse pipeline (or anywhere else really).

## Suggested usage instructions

In order for this to work two environment variables will need to be set:

`SLACK_BOT_TOKEN` this is the `Bot User OAuth Access Token` which is generated when an app is registered to a workspace.  
The bot will need the bot token scopes `chat:write` and `files:write` and the app will need to be installed as an App in
any channel you wish to use it in.

`CHANNEL` this token can be found as the last part of the URL for a channel (right-click and "Copy link").

Build with `./gradlew clean install` then add `./build/install/verify-slack-java-cli/bin` to your path and run like so:

`verify-java-slack-cli send-message "some useful message to be sent to the channel"`

`verify-java-slack-cli upload-file --file=somefile [--comment="an optional comment that gets posted with the file"]`

