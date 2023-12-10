import os
from PIL import Image, ImageOps, ImageEnhance

sourceDir = "./src_card_images/"
saveDir = "./src/main/resources/static/img/cards/"
newsize = (100,150)

imageFiles = os.listdir(sourceDir)


def adjustBackCard(inputImage):
    enhanceContrast = ImageEnhance.Contrast(inputImage)
    enhanceContrast = enhanceContrast.enhance(10)

    redTint = ImageOps.colorize(enhanceContrast.convert("L") , black ="black", white ="red") 

    adjustBrightness = ImageEnhance.Brightness(redTint)
    adjustBrightness = adjustBrightness.enhance(0.9)
    return adjustBrightness

def createBlankPlaceholders():
    emptyBg = Image.new("RGB", newsize, "#009900")
    emptyBgFile = saveDir+"/empty_bg.jpg"
    emptyBg .save(emptyBgFile, optimize=True, quality=20)

    emptySpace = Image.new("RGB", newsize, "#00CC00")
    emptySpaceFile = saveDir+"/empty_space.jpg"
    emptySpace.save(emptySpaceFile, optimize=True, quality=20)


def createCards():
    for imageFile in imageFiles:
        fileName, ext = os.path.splitext(imageFile)
        #print(fileName, ext)
        if(ext != ".png"):
            continue

        with Image.open(sourceDir+"/"+imageFile) as im:
            resizeImage = ImageOps.fit(im,newsize)
            whiteBg = Image.new("RGBA", resizeImage.size, (255,255,255))
            whiteBg.paste(resizeImage,(0,0),resizeImage)
            #whiteBg.paste(resizeImage,resizeImage.size)

            flattenColor = whiteBg.convert('RGB')

            imageToSave = flattenColor

            if(fileName == "back"):
                imageToSave = adjustBackCard(imageToSave)

            cardFile = saveDir+"/"+fileName+".jpg"
            imageToSave.save(cardFile, optimize=True, quality=40)

            topFile = saveDir+"/top_"+fileName+".jpg"
            cardTop = imageToSave.crop((0,0,imageToSave.width, imageToSave.height / 8))

            if(fileName == "back"):
                cardTop = imageToSave.crop((0,0,imageToSave.width, imageToSave.height / 25))

            cardTop.save(topFile, optimize=True, quality=40)
        

createCards()
createBlankPlaceholders()
        
