package org.example.record;

public enum Size {
    SMALL {
        @Override
        public String toString() {
            return "small";
        }
    }, MEDIUM {
        @Override
        public String toString() {
            return "medium";
        }
    }, LARGE {
        @Override
        public String toString() {
            return "large";
        }
    };
}
