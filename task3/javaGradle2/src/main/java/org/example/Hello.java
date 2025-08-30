package org.example;

import org.apache.commons.lang3.StringUtils;

public class Hello {
    public static void main(String[] args) {
        System.out.println("🟢 Hello from Java + Gradle!");
        System.out.println("📦 Built using Gradle automation.");
        System.out.println("🔧 Using Apache Commons: " + StringUtils.upperCase("hello from dependency!"));
    }
}