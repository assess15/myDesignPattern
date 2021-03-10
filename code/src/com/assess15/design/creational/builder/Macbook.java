package com.assess15.design.creational.builder;

/**
 * 链式调用
 */
public class Macbook {

    private String macOS;
    private String air;
    private String pro;

    public Macbook(Builder builder) {
        macOS = builder.macOS;
        air = builder.air;
        pro = builder.pro;
    }

    public static void main(String[] args) {
        Macbook mb = new Macbook.Builder()
                .setAir("2020 air")
                .setMacOS("2020 Big Sur")
                .setMacOS("2020 MBP")
                .build();

        Builder builder1 = new Builder();
        builder1.setMacOS("2020");
        builder1.build();

        System.out.println(mb);
    }

    @Override
    public String toString() {
        return "Macbook{" +
                "macOS='" + macOS + '\'' +
                ", air='" + air + '\'' +
                ", pro='" + pro + '\'' +
                '}';
    }

    public static class Builder {
        private String macOS;
        private String air;
        private String pro;

        public Builder setMacOS(String macOS) {
            this.macOS = macOS;
            return this;
        }

        public Builder setAir(String air) {
            this.air = air;
            return this;
        }

        public Builder setPro(String pro) {
            this.pro = pro;
            return this;
        }

        public Macbook build() {
            return new Macbook(this);
        }
    }
}
