resolvers in ThisBuild += "lightbend-commercial-mvn" at
        "https://repo.lightbend.com/pass/yXXapqyxp8WFFFrSwRanWOAZNb5SpSyIbEbZQ1KHQdUx59lV/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/yXXapqyxp8WFFFrSwRanWOAZNb5SpSyIbEbZQ1KHQdUx59lV/commercial-releases"))(Resolver.ivyStylePatterns)