package common

open class Media

open class VideoMedia : Media()
open class AudioMedia : Media()

class Movie : VideoMedia()
class Episode : VideoMedia()
class Song : AudioMedia()
class Podcast : AudioMedia()
