package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, MailAccount account, Mail mail) {
        String mId = account.getMailID();
        m.send(mId, mail);
    }
    // end::buildAndSendMail[]


    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, Mail mail) {}

    }

    private class MailFont {

    }

    private class Mail {
        public Mail(String subject, MailMessage message) {
        }
    }

    private class MailMessage {

    }

    public class Name {
        private String firstName;
        private String lastName;
        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public class MailAccount{

        private Name name;
        private String division;
        public MailAccount(Name name, String division) {
            this.name = name;
            this.division = division;
        }

        public Name getName() {
            return name;
        }

        public String getDivision() {
            return division;
        }

        public String getMailID() {
            return name.getFirstName().charAt(0) + "." + name.getLastName().substring(0, 7) + "@"
                    + division.substring(0, 5) + ".compa.ny";
        }
    }
}
