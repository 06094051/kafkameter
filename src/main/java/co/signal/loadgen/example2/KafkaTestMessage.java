package co.signal.loadgen.example2;

public class KafkaTestMessage implements SyntheticLoadGenerator {
    public KafkaTestMessage(String ignored) {}
        @Override
        public String nextMessage() {
            return "This is test message for Kafka";
        }
    }
}
