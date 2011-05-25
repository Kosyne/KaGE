;Base Engine File

Include "KaGE\engine\constants.bb"
Include "KaGE\engine\config.bb"

;Structures

Type tKaGE
	Field Info.tInfo
	Field Properties
	Field Game.tGame
End Type
	
	
Type tInfo
	Field Title
	Field Author
	Field Description
End Type

Type tGame
	Field Scene.tScene
End Type

;Functions