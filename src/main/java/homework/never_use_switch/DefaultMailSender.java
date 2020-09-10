package homework.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Component
public class DefaultMailSender implements MailSender {

    public static int DEFAULT_MAIL_SENDER_CODE = 0;

    @Override
    public void sendMail(MailInfo mailInfo) {
        throw new UnsupportedOperationException(mailInfo.getMailType() + " not supported yet");
    }

    @Override
    public int myCode() {
        return 0;
    }
}
