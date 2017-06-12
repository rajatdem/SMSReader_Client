package zirks.example;

import com.bezirk.middleware.messages.Event;

/**
 * Created by rajatmathur on 6/12/17.
 */

public class SMSReader extends Event {

    private final String smsText;
    private final String sender;

    public SMSReader(String smsText, String sender) {
        this.smsText = smsText;
        this.sender = sender;
    }

    public String getSmsText() {
        return smsText;
    }

    public String getSender() {
        return sender;
    }

}


