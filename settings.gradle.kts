@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        maven {
            name = "luca992/KHex GitHub Packages"
            url = uri("https://maven.pkg.github.com/luca992/KHex")
            credentials {
                username = "token"
                // see: https://github.community/t/download-from-github-package-registry-without-authentication/14407/44
                password = "\u0067\u0068\u0070\u005f\u0072\u0067\u0070\u0054\u0069\u006c\u004c\u0042\u0038\u006c\u0066\u0057\u0045\u0056\u0031\u0053\u004a\u006d\u0061\u006b\u004a\u004c\u005a\u0063\u0038\u004d\u0074\u0038\u0045\u0066\u0031\u0059\u0053\u0058\u0039\u0055"
            }
        }
        mavenCentral()
    }
}

include(":keccak")
include(":sha256")
include(":sha512")
include(":ripemd160")