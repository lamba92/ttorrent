/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

pluginManagement {
    // Include 'plugins build' to define convention plugins.
    includeBuild("build-logic")
}

rootProject.name = "ttorrent"
include(":ttorrent-network")
include(":ttorrent-client")
include(":ttorrent-cli")
include(":ttorrent-bencoding")
include(":ttorrent-tests")
include(":ttorrent-common")
include(":ttorrent-test-api")
include(":ttorrent-tracker")
project(":ttorrent-network").projectDir = file("network")
project(":ttorrent-cli").projectDir = file("cli")
project(":ttorrent-bencoding").projectDir = file("bencoding")
project(":ttorrent-tests").projectDir = file("tests")
project(":ttorrent-common").projectDir = file("common")
project(":ttorrent-test-api").projectDir = file("test-api")
