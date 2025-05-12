package com.rankup.demo.config

// 🔐 This is a mock Firebase config file. Real credentials are excluded.

object FirebaseConfig {
    const val firestoreBaseUrl = "https://rankup-sample.firebaseio.com"
    const val authMethod = "Email/Password"
    const val exampleStructure = """
    /clubs
      - clubName: String
      - location: String
      - membersCount: Int
    /users
      - userId
      - username
      - joinedClubs: List<String>
    """
}
