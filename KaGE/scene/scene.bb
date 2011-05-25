;Scene File

;Consider either using a new scene type for each scene, or
;using just one and reusing it.

;On top of that, consider representing each scene with a single Function.
;That way, each scene gets its own personalized events. With it, though a
;type of 'game script' file would be necessary to know where to go and when.

;One way to do this would be to either create a variable or an array and call
;a function such as SceneChange(2,3) or something.

;The KEY issue here is getting a scene's level data AND its event to load intact.
;I would rather not use such a method as the 'goto' keyword, but its looking to be
;the simplest solution to this issue.


;TEMPORARY gfx initialize for the sake of testing scenes.
Graphics3D 320,240,32,2

;##############################
; - Globals
;##############################

Global ScnMesh$
Global ScnMusic$
Global ScnName$
Global ScnDescription$

;##############################
; - Structures
;##############################
Type tSceneMgr
	Field Root
	Field Scene.tScene
	Field Properties.tProperties
End Type

;Similar to tSceneMgr, this type will load itself INTO the Scene Manager with LoadScene()
Type tScene
	Field Mesh$ ;path to a mesh (optional)
	Field Properties.tProperties
End Type

;Basic properties. Due to its generic nature, consider moving to KaGE.bb or Engine.bb
Type tProperties
	Field Name$
	Field Description$
End Type

;Create the Scene Manager. It works by loading into itself the scene structure in
;each individual scene with LoadScene()
Global sceneMgr.tSceneMgr = New tSceneMgr
sceneMgr\Root = CreatePivot()
sceneMgr\Scene = New tScene
sceneMgr\Properties = New tProperties
sceneMgr\Properties\Name = "Scene Manager"
sceneMgr\Properties\Description = "Manages Scenes."



;Functions
Function LoadScene(scene.tscene)
	scene.tscene = New tScene
	
	If ScnName
		sceneMgr\Properties\Name = ScnName
	EndIf
	If ScnDescription
		sceneMgr\Properties\Description = ScnDescription
	EndIf


End Function

Function DebugScene()
	Print "Scene name is: " + sceneMgr\properties\name + "."
	Print ""
	Print "Scene info: " + sceneMgr\properties\description + ""
End Function

Include ".\KaGE\scene\scenes\scene1.bb"