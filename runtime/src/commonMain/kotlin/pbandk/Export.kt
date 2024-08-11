@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package pbandk

/**
 * Marks the target for export on Kotlin/JS. Currently does nothing on all other platforms (JVM, Native, WasmJs,
 * WasmWasi).
 *
 * Note: This means that declarations annotated with [pbandk.Export] _will not_ be exported in Wasm environments,
 * unlike the behavior of the [kotlin.js.JsExport] annotation. Because Wasm does not support exporting classes or
 * complex types, we are not currently able to export pbandk-generated classes for use directly from Wasm code.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION, AnnotationTarget.FILE)
@PublicForGeneratedCode
public expect annotation class Export()

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@PublicForGeneratedCode
public expect annotation class JsName(val name: String)