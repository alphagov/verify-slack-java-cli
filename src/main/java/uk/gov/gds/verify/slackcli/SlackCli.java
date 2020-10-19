package uk.gov.gds.verify.slackcli;

import picocli.CommandLine;

@CommandLine.Command(name = "SlackCli",
        description = "Do things in Slack from with a CLI 🤖",
        subcommands = {FileUploadCommand.class, SendMessageCommand.class})
public class SlackCli implements Runnable {
    public static void main(String[] args) throws Exception {
        CommandLine application = new CommandLine(new SlackCli()).setCaseInsensitiveEnumValuesAllowed(true);
        application.execute(args);
        System.exit(0);
    }

    public void run() {
        CommandLine.usage(this, System.err);
    }
}
