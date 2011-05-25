;Scene File

;TEMPORARY gfx initialize for the sake of testing scenes.
Graphics3D 320,240,32,2

;##############################
; - Structures
;##############################
Type tScene
	Field Root
	Field Properties.tProperties
End Type

Type tProperties
	Field Name$
	Field Description$
End Type



;Functions
Function kLoadScene(newscene.tscene)

newscene.tscene = New tScene


End Function

Function DebugScene(newscene.tscene)

Print "Scene name is: " + newscene\properties\name + "."
Print ""
Print "Scene info: " + newscene\properties\description + ""
End Function

Include ".\KaGE\scene\scenes\scene1.bb"