package cc.unitmesh.database.provider

import cc.unitmesh.devti.custom.document.LivingDocumentationType
import cc.unitmesh.devti.provider.LivingDocumentation
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.SelectionModel
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.sql.psi.SqlDdlStatement
import com.intellij.sql.psi.SqlDeclareStatement
import com.intellij.sql.psi.SqlFile

class SqlLivingDocumentationProvider : LivingDocumentation {
    override val forbiddenRules: List<String>
        get() = TODO("Not yet implemented")

    override fun startEndString(type: LivingDocumentationType): Pair<String, String> {
        return Pair("--", "--")
    }

    override fun updateDoc(target: PsiElement, newDoc: String, type: LivingDocumentationType, editor: Editor) {
        TODO("Not yet implemented")
    }

    override fun findNearestDocumentationTarget(psiElement: PsiElement): PsiNameIdentifierOwner? {
        return null
    }

    override fun findDocTargetsInSelection(
        root: PsiElement,
        selectionModel: SelectionModel
    ): List<PsiNameIdentifierOwner> {
        return emptyList()
    }
}
