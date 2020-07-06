/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.scopes

import org.jetbrains.kotlin.idea.frontend.api.ValidityOwner
import org.jetbrains.kotlin.idea.frontend.api.symbols.KtClassOrObjectSymbol
import org.jetbrains.kotlin.idea.frontend.api.symbols.KtPackageSymbol

abstract class KtScopeProvider : ValidityOwner {
    abstract fun getMemberScope(classSymbol: KtClassOrObjectSymbol): KtMemberScope
    abstract fun getDeclaredMemberScope(classSymbol: KtClassOrObjectSymbol): KtDeclaredMemberScope
    abstract fun getPackageScope(packageSymbol: KtPackageSymbol): KtPackageScope
    abstract fun getCompositeScope(subScopes: List<KtScope>): KtCompositeScope
}