package org.elixir_lang.psi.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import org.elixir_lang.psi.ElixirUnmatchedUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.stub.call.Stub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UnmatchedUnqualifiedNoParenthesesCall extends Stub<ElixirUnmatchedUnqualifiedNoParenthesesCall> {
    public UnmatchedUnqualifiedNoParenthesesCall(StubElement parent, @NotNull IStubElementType elementType, @Nullable StringRef resolvedModuleName, @Nullable StringRef resolvedFunctionName, int resolvedFinalArity, boolean hasDoBlockOrKeyword, @NotNull StringRef name) {
        super(parent, elementType, resolvedModuleName, resolvedFunctionName, resolvedFinalArity, hasDoBlockOrKeyword, name);
    }

    public UnmatchedUnqualifiedNoParenthesesCall(StubElement parent, @NotNull IStubElementType elementType, @Nullable String resolvedModuleName, @Nullable String resolvedFunctionName, int resolvedFinalArity, boolean hasDoBlockOrKeyword, @NotNull String name) {
        super(parent, elementType, resolvedModuleName, resolvedFunctionName, resolvedFinalArity, hasDoBlockOrKeyword, name);
    }
}
