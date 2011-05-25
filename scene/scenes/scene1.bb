;Creating the Scene as a Type
Scene1.tscene = New tScene
Scene1\Root = CreatePivot()
Scene1\Properties = New tproperties
Scene1\Properties\Name = "Test Scene"
Scene1\Properties\Description = "A test scene for testing."

;Scene code


Print "Hello World!"
WaitKey

DebugScene(Scene1)
WaitKey