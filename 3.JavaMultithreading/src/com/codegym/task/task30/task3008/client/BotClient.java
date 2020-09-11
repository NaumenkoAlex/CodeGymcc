package com.codegym.task.task30.task3008.client;

import com.codegym.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BotClient extends Client{


    public class BotSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            BotClient.this.sendTextMessage("Hello, there. I'm a bot. I understand the following commands: date, day, month, year, time, hour, minutes, seconds.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);

            if (message.contains(":")){
                String userName = message.split(":")[0].trim();
                String text = message.split(":")[1].trim();
                Calendar calendar = new GregorianCalendar();
                Date currentDate = calendar.getTime();
                SimpleDateFormat formatForDateNow = null;

                switch (text){
                    case "date":
                        formatForDateNow = new SimpleDateFormat("d.MM.YYYY");
                        break;
                    case "day" :
                        formatForDateNow = new SimpleDateFormat("d");
                        break;
                    case "month":
                        formatForDateNow = new SimpleDateFormat("MMMM");
                        break;
                    case "year":
                        formatForDateNow = new SimpleDateFormat("YYYY");
                        break;
                    case "time":
                        formatForDateNow = new SimpleDateFormat("H:mm:ss");
                        break;
                    case "hour":
                        formatForDateNow = new SimpleDateFormat("H");
                        break;
                    case "minutes":
                        formatForDateNow = new SimpleDateFormat("m");
                        break;
                    case "seconds":
                        formatForDateNow = new SimpleDateFormat("s");
                        break;
                }

                if (formatForDateNow != null){
                    sendTextMessage(String.format("Information for %s: %s", userName, formatForDateNow.format(currentDate)));
                }

            }

        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int)(Math.random() * 100);
    }


    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }
}
