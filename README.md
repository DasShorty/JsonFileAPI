# JSONFile API

## Simple API for coding with JSON in Java/Kotlin

-----

# Usage

### Creating File

``JsonFile file = new JsonFile("./data/","test");``

### Writing in File

``file.set("test", "hello");``

### Get value with key

``Object o = file.get("test"");``

# Dependencies
[Visit JitPack](https://jitpack.io/#ShortException/JsonFileAPI/v1-SNAPSHOT)

    repositories {
            maven { url 'https://jitpack.io' }
    }

	dependencies {
	        implementation 'com.github.ShortException:JsonFileAPI:v1-SNAPSHOT'
	}

