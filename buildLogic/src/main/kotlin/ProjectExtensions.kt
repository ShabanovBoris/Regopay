import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies

fun Project.implementation(vararg impl: Any, block: DependencyHandlerScope.() -> Unit = {}) {
    impl.forEach {
        dependencies.add("implementation", it)
    }
    dependencies {
        block()
    }
}

fun Project.api(vararg impl: Any) {
    impl.forEach {
        dependencies.add("api", it)
    }
}