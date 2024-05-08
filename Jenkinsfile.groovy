@Library('roboshop') _

env.component="shipping"
env.app_lang = "maven"
env.sonar_extra_opts = "-Dsonar.java.binaries=./target"
ci()