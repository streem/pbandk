package pbandk

@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "This API should only be used by generated code.")
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
annotation class PublicForGeneratedCode

@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "This API should only be used internally by pbandk.")
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
annotation class PbandkInternal

@RequiresOptIn(
    level = RequiresOptIn.Level.WARNING,
    message = "Support for the proto3 JSON encoding is experimental and incomplete."
)
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
annotation class ExperimentalProtoJson