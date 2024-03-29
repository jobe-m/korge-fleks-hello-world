import com.soywiz.korge.gradle.*

plugins {
	alias(libs.plugins.korge)
}

korge {
	id = "com.sample.demo"

	// Using Fleks from maven central / local
	dependencyMulti("io.github.quillraven.fleks:Fleks:2.0", registerPlugin = false)

// To enable all targets at once

	targetAll()

// To enable targets based on properties/environment variables
	//targetDefault()

// To selectively enable targets
	
	targetJvm()
	targetJs()
	targetDesktop()
	targetIos()
	targetAndroidIndirect() // targetAndroidDirect()
	//targetAndroidDirect()
}
