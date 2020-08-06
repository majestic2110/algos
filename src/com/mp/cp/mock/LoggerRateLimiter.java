package com.mp.cp.mock;

import org.junit.jupiter.api.Test;

import java.util.*;

public class LoggerRateLimiter {
    @Test
    public void test() {
        Logger obj = new Logger();
        obj.shouldPrintMessage(1, "foo");
        obj.shouldPrintMessage(2, "bar");
        obj.shouldPrintMessage(3, "foo");
        obj.shouldPrintMessage(8, "bar");
        obj.shouldPrintMessage(10, "foo");
        obj.shouldPrintMessage(11, "foo");
    }

    class LoggerII {
        private HashMap<String, Integer> msgDict;

        /**
         * Initialize your data structure here.
         */
        public LoggerII() {
            msgDict = new HashMap<String, Integer>();
        }

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {

            if (!this.msgDict.containsKey(message)) {
                this.msgDict.put(message, timestamp);
                return true;
            }

            Integer oldTimestamp = this.msgDict.get(message);
            if (timestamp - oldTimestamp >= 10) {
                this.msgDict.put(message, timestamp);
                return true;
            } else
                return false;
        }
    }

    class Logger {

        private Queue<Message> queue = null;
        private Set<String> messages = null;

        /**
         * Initialize your data structure here.
         */
        public Logger() {
            queue = new LinkedList<>();
            messages = new HashSet<String>();
        }

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {
            while (!queue.isEmpty() && queue.peek().time <= timestamp - 10) {
                messages.remove(queue.poll().message);
            }
            if (messages.contains(message))
                return false;
            queue.add(new Message(timestamp, message));
            messages.add(message);
            return true;

        }

        class Message {
            int time;
            String message;

            public Message(int time, String message) {
                this.time = time;
                this.message = message;
            }
        }
    }
}
